package dto;

import data.ResultData;

public class ResultDataDTO {
    private ResultData resultData;

    public ResultDataDTO(ResultData resultData) {
        this.resultData = resultData;
    }

    public ResultData getResultData() {

        return resultData;
    }

    public void setResultData(ResultData resultData) {
        this.resultData = resultData;
    }
}
