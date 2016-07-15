package example;

public class Response<T> {

    private String error;

    private T body;

    public Response(String error) {
        this.error = error;
    }

    public Response(T body) {
        this.body = body;
    }

    public Response(String error, T body) {
        this.error = error;
        this.body = body;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
