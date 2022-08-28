package com.hummerrisk.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hummerrisk.base.domain.Code;
import com.hummerrisk.base.domain.Sbom;
import com.hummerrisk.base.domain.SbomVersion;
import com.hummerrisk.commons.utils.PageUtils;
import com.hummerrisk.commons.utils.Pager;
import com.hummerrisk.controller.handler.annotation.I18n;
import com.hummerrisk.controller.request.code.CodeRequest;
import com.hummerrisk.controller.request.sbom.SbomRequest;
import com.hummerrisk.controller.request.sbom.SbomVersionRequest;
import com.hummerrisk.dto.CodeDTO;
import com.hummerrisk.dto.SbomDTO;
import com.hummerrisk.service.SbomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "SBOM管理")
@RestController
@RequestMapping(value = "sbom")
public class SbomController {

    @Resource
    private SbomService sbomService;

    @I18n
    @ApiOperation(value = "SBOM项目列表")
    @PostMapping("list/{goPage}/{pageSize}")
    public Pager<List<SbomDTO>> sbomList(
            @PathVariable int goPage, @PathVariable int pageSize, @RequestBody SbomRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, sbomService.sbomList(request));
    }

    @I18n
    @ApiOperation(value = "添加SBOM项目")
    @PostMapping(value = "addSbom")
    public Sbom addSbom(@RequestBody Sbom request) throws Exception {
        return sbomService.addSbom(request);
    }

    @I18n
    @ApiOperation(value = "修改SBOM项目")
    @PostMapping(value = "updateSbom")
    public Sbom updateSbom(@RequestBody Sbom request) throws Exception {
        return sbomService.updateSbom(request);
    }

    @ApiOperation(value = "删除SBOM项目")
    @GetMapping("deleteSbom/{id}")
    public void deleteSbom(@PathVariable String id) throws Exception {
        sbomService.deleteSbom(id);
    }

    @ApiOperation(value = "执行SBOM检测")
    @GetMapping("scan/{id}")
    public void scan(@PathVariable String id) throws Exception {
        sbomService.scan(id);
    }

    @I18n
    @ApiOperation(value = "SBOM项目版本列表")
    @PostMapping("sbomVersionList/{goPage}/{pageSize}")
    public Pager<List<SbomVersion>> sbomVersionList(
            @PathVariable int goPage, @PathVariable int pageSize, @RequestBody SbomVersionRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, sbomService.sbomVersionList(request));
    }

    @I18n
    @ApiOperation(value = "添加SBOM项目版本")
    @PostMapping(value = "addSbomVersion")
    public SbomVersion addSbomVersion(@RequestBody SbomVersion request) throws Exception {
        return sbomService.addSbomVersion(request);
    }

    @I18n
    @ApiOperation(value = "修改SBOM项目版本")
    @PostMapping(value = "updateSbomVersion")
    public SbomVersion updateSbomVersion(@RequestBody SbomVersion request) throws Exception {
        return sbomService.updateSbomVersion(request);
    }

    @ApiOperation(value = "删除SBOM项目版本")
    @GetMapping("deleteSbomVersion/{id}")
    public void deleteSbomVersion(@PathVariable String id) throws Exception {
        sbomService.deleteSbomVersion(id);
    }

}