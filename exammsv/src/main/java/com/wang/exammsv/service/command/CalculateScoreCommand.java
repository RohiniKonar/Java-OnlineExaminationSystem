package com.wang.exammsv.service.command;

import com.wang.exammsv.domain.StudentExamResult;

import java.util.List;

public class CalculateScoreCommand implements GradeCommand {
    @Override
    public void execute(List<StudentExamResult> resultList) throws BreakChainException {

    }
}
