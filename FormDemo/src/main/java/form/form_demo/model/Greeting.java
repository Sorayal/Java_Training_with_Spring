package form.form_demo.model;

/**
 * Pojo for Greeting
 *
 * @version 1.0
 */
public class Greeting {

    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Greeting { id= %d content= %s }", id, content);
    }
}
