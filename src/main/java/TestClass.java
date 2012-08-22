import lombok.Data;

@Data
public class TestClass {

    private String string;

    public void someMethod() {
        setString("test");
    }

}
