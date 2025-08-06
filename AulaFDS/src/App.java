public class App {
    public static void main(String[] args) {
        System.out.println("\nHellow Word!");
        String version = System.getProperty("java.version");
        System.out.println("\nRunning Java Version:"+version+"\n");
        String name = System.getProperty("user.name");
        System.out.println("User account name: "+name+"\n");
       
    }
}
