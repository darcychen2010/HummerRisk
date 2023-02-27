-- quartz start
CREATE TABLE IF NOT EXISTS qrtz_job_details (
  SCHED_NAME         varchar(120)    NOT NULL,
  JOB_NAME           varchar(200)    NOT NULL,
  JOB_GROUP          varchar(200)    NOT NULL,
  DESCRIPTION        varchar(250)    DEFAULT NULL,
  JOB_CLASS_NAME     varchar(250)    NOT NULL,
  IS_DURABLE         varchar(1)      NOT NULL,
  IS_NONCONCURRENT   varchar(1)      NOT NULL,
  IS_UPDATE_DATA     varchar(1)      NOT NULL,
  REQUESTS_RECOVERY  varchar(1)      NOT NULL,
  JOB_DATA           blob            DEFAULT NULL,
  PRIMARY KEY ( SCHED_NAME,JOB_NAME,JOB_GROUP ),
  KEY IDX_QRTZ_J_REQ_RECOVERY ( SCHED_NAME,REQUESTS_RECOVERY ),
  KEY IDX_QRTZ_J_GRP ( SCHED_NAME,JOB_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_triggers (
  SCHED_NAME             varchar(120)    NOT NULL,
  TRIGGER_NAME           varchar(200)    NOT NULL,
  TRIGGER_GROUP          varchar(200)    NOT NULL,
  JOB_NAME               varchar(200)    NOT NULL,
  JOB_GROUP              varchar(200)    NOT NULL,
  DESCRIPTION            varchar(250)    DEFAULT NULL,
  NEXT_FIRE_TIME         bigint          DEFAULT NULL,
  PREV_FIRE_TIME         bigint          DEFAULT NULL,
  PRIORITY               int             DEFAULT NULL,
  TRIGGER_STATE          varchar(16)     NOT NULL,
  TRIGGER_TYPE           varchar(8)      NOT NULL,
  START_TIME             bigint          NOT NULL,
  END_TIME               bigint          DEFAULT NULL,
  CALENDAR_NAME          varchar(200)    DEFAULT NULL,
  MISFIRE_INSTR          smallint        DEFAULT NULL,
  JOB_DATA               blob            DEFAULT NULL,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  KEY IDX_QRTZ_T_J ( SCHED_NAME,JOB_NAME,JOB_GROUP ),
  KEY IDX_QRTZ_T_JG ( SCHED_NAME,JOB_GROUP ),
  KEY IDX_QRTZ_T_C ( SCHED_NAME,CALENDAR_NAME ),
  KEY IDX_QRTZ_T_G ( SCHED_NAME,TRIGGER_GROUP ),
  KEY IDX_QRTZ_T_STATE ( SCHED_NAME,TRIGGER_STATE ),
  KEY IDX_QRTZ_T_N_STATE ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,TRIGGER_STATE ),
  KEY IDX_QRTZ_T_N_G_STATE ( SCHED_NAME,TRIGGER_GROUP,TRIGGER_STATE ),
  KEY IDX_QRTZ_T_NEXT_FIRE_TIME ( SCHED_NAME,NEXT_FIRE_TIME ),
  KEY IDX_QRTZ_T_NFT_ST ( SCHED_NAME,TRIGGER_STATE,NEXT_FIRE_TIME ),
  KEY IDX_QRTZ_T_NFT_MISFIRE ( SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME ),
  KEY IDX_QRTZ_T_NFT_ST_MISFIRE ( SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME,TRIGGER_STATE ),
  KEY IDX_QRTZ_T_NFT_ST_MISFIRE_GRP ( SCHED_NAME,MISFIRE_INSTR,NEXT_FIRE_TIME,TRIGGER_GROUP,TRIGGER_STATE ),
  CONSTRAINT qrtz_triggers_ibfk_1 FOREIGN KEY ( SCHED_NAME, JOB_NAME, JOB_GROUP ) REFERENCES qrtz_job_details ( SCHED_NAME, JOB_NAME, JOB_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_blob_triggers (
  SCHED_NAME         varchar(120)    NOT NULL,
  TRIGGER_NAME       varchar(200)    NOT NULL,
  TRIGGER_GROUP      varchar(200)    NOT NULL,
  BLOB_DATA blob,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  KEY SCHED_NAME ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  CONSTRAINT qrtz_blob_triggers_ibfk_1 FOREIGN KEY ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP ) REFERENCES qrtz_triggers ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_calendars (
  SCHED_NAME         varchar(120)    NOT NULL,
  CALENDAR_NAME      varchar(200)    NOT NULL,
  CALENDAR           blob            NOT NULL,
  PRIMARY KEY ( SCHED_NAME,CALENDAR_NAME )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_cron_triggers (
  SCHED_NAME         varchar(120)    NOT NULL,
  TRIGGER_NAME       varchar(200)    NOT NULL,
  TRIGGER_GROUP      varchar(200)    NOT NULL,
  CRON_EXPRESSION    varchar(120)    NOT NULL,
  TIME_ZONE_ID       varchar(80)     DEFAULT NULL,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  CONSTRAINT qrtz_cron_triggers_ibfk_1 FOREIGN KEY ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP ) REFERENCES qrtz_triggers ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_fired_triggers (
  SCHED_NAME         varchar(120)    NOT NULL,
  ENTRY_ID           varchar(95)     NOT NULL,
  TRIGGER_NAME       varchar(200)    NOT NULL,
  TRIGGER_GROUP      varchar(200)    NOT NULL,
  INSTANCE_NAME      varchar(200)    NOT NULL,
  FIRED_TIME         bigint          NOT NULL,
  SCHED_TIME         bigint          NOT NULL,
  PRIORITY           int          NOT NULL,
  STATE              varchar(16)     NOT NULL,
  JOB_NAME           varchar(200)    DEFAULT NULL,
  JOB_GROUP          varchar(200)    DEFAULT NULL,
  IS_NONCONCURRENT   varchar(1)      DEFAULT NULL,
  REQUESTS_RECOVERY  varchar(1)      DEFAULT NULL,
  PRIMARY KEY ( SCHED_NAME,ENTRY_ID ),
  KEY IDX_QRTZ_FT_TRIG_INST_NAME ( SCHED_NAME,INSTANCE_NAME ),
  KEY IDX_QRTZ_FT_INST_JOB_REQ_RCVRY ( SCHED_NAME,INSTANCE_NAME,REQUESTS_RECOVERY ),
  KEY IDX_QRTZ_FT_J_G ( SCHED_NAME,JOB_NAME,JOB_GROUP ),
  KEY IDX_QRTZ_FT_JG ( SCHED_NAME,JOB_GROUP ),
  KEY IDX_QRTZ_FT_T_G ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  KEY IDX_QRTZ_FT_TG ( SCHED_NAME,TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_locks (
  SCHED_NAME     varchar(120)    NOT NULL,
  LOCK_NAME      varchar(40)     NOT NULL,
  PRIMARY KEY ( SCHED_NAME,LOCK_NAME )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_paused_trigger_grps (
  SCHED_NAME     varchar(120)    NOT NULL,
  TRIGGER_GROUP  varchar(200)    NOT NULL,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_scheduler_state (
  SCHED_NAME         varchar(120)    NOT NULL,
  INSTANCE_NAME      varchar(200)    NOT NULL,
  LAST_CHECKIN_TIME  bigint          NOT NULL,
  CHECKIN_INTERVAL   bigint          NOT NULL,
  PRIMARY KEY ( SCHED_NAME,INSTANCE_NAME )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_simple_triggers (
  SCHED_NAME         varchar(120)    NOT NULL,
  TRIGGER_NAME       varchar(200)    NOT NULL,
  TRIGGER_GROUP      varchar(200)    NOT NULL,
  REPEAT_COUNT       bigint          NOT NULL,
  REPEAT_INTERVAL    bigint          NOT NULL,
  TIMES_TRIGGERED    bigint          NOT NULL,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  CONSTRAINT qrtz_simple_triggers_ibfk_1 FOREIGN KEY ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP ) REFERENCES qrtz_triggers ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS qrtz_simprop_triggers (
  SCHED_NAME         varchar(120)    NOT NULL,
  TRIGGER_NAME       varchar(200)    NOT NULL,
  TRIGGER_GROUP      varchar(200)    NOT NULL,
  STR_PROP_1         varchar(512)    DEFAULT NULL,
  STR_PROP_2         varchar(512)    DEFAULT NULL,
  STR_PROP_3         varchar(512)    DEFAULT NULL,
  INT_PROP_1         int          DEFAULT NULL,
  INT_PROP_2         int          DEFAULT NULL,
  LONG_PROP_1        bigint          DEFAULT NULL,
  LONG_PROP_2        bigint          DEFAULT NULL,
  DEC_PROP_1         decimal(13,4 )   DEFAULT NULL,
  DEC_PROP_2         decimal(13,4 )   DEFAULT NULL,
  BOOL_PROP_1        varchar(1)      DEFAULT NULL,
  BOOL_PROP_2        varchar(1)      DEFAULT NULL,
  PRIMARY KEY ( SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP ),
  CONSTRAINT qrtz_simprop_triggers_ibfk_1 FOREIGN KEY ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP ) REFERENCES qrtz_triggers ( SCHED_NAME, TRIGGER_NAME, TRIGGER_GROUP )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;
-- quartz end

CREATE TABLE IF NOT EXISTS schedule (
  id             varchar(50)         NOT NULL,
  `key`          varchar(50)         NOT NULL,
  type           varchar(50)         NOT NULL,
  value          varchar(255)        NOT NULL,
  `group`        varchar(50)         DEFAULT NULL,
  job            varchar(64)         NOT NULL,
  enable         tinyint             DEFAULT NULL,
  resource_id    varchar(64)         DEFAULT NULL,
  user_id        varchar(50)         DEFAULT NULL,
  custom_data    longtext            DEFAULT NULL,
  PRIMARY KEY ( id ),
  KEY resource_id ( resource_id )
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;
