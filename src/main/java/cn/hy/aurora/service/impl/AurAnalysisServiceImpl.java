package cn.hy.aurora.service.impl;

import cn.hy.aurora.service.AurAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author heyi
 */
@Service
public class AurAnalysisServiceImpl implements AurAnalysisService {

    @Autowired
    @SuppressWarnings("all")
    private AurAnalysisMapper aurAnalysisMapper;

    @Override
    public Collection<Integer> selectAnalysis() {
        return aurAnalysisMapper.selectAnalysis().get(0).values();
    }
}
