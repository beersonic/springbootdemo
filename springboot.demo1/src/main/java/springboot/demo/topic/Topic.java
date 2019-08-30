package springboot.demo.topic;

public class Topic{
    private String id;
    private String name;
    private String description;

    public Topic(){

    }

    public Topic(String id, String name, String description)
    {
        setId(id);
        setName(name);
        setDescription(description);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}