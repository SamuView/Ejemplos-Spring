package viewnext.cursos.springboot.Springboothelloworld.models;

public class Greeting {
    
    private String message;
    private long counter;

    // Constructor
    public Greeting(long counter,String message) {
        this.counter = counter;
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }
    public long getCounter() {
		return counter;
	}

	// Setter
    public void setMessage(String message) {
        this.message = message;
    }
    public void setCounter(long counter) {
		this.counter = counter;
	}
}