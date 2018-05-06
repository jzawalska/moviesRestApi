package pl.springboot.movies.exceptions;

import java.util.Map;

public class ResourceException {
    private Integer status;
    private String error;
    private String message;
    private String timeStamp;
    private String trace;

    public ResourceException(int status, Map<String, Object> errorAttributes) {
        super();
        this.status = status;
        this.error = (String) errorAttributes.get("error");
        this.message = (String) errorAttributes.get("message");
        this.timeStamp = errorAttributes.get("timestamp").toString();
        this.trace = (String) errorAttributes.get("trace");
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getTrace() {
        return trace;
    }
}
