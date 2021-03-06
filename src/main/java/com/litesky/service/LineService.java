package com.litesky.service;

import com.litesky.model.Line;

import java.util.Date;
import java.util.List;

/**
 * Created by finefine.com on 2017/12/14.
 */
public interface LineService {

    List<Line> getAllLines();

    List<Line> findLineByStation(String station);

    /**
     * 正则匹配查询
     * @param station
     * @return
     */
    List<Line> findLineByStationRegexAndDate(String station, Date date);

    /**
     * 通过id查找路线
     * @param id
     * @return
     */
    Line findById(Long id);

    /**
     * 删除指定id的line
     * @param id
     * @return
     */
    void deleteById(Long id);

    /**
     * 更新和保存路线
     * @param line
     */
    Line saveLine(Line line);
}
