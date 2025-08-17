public class RuntimeExample {
    public static void main(String[] args) throws Exception {
        // Runtime object milta hai
        Runtime runtime = Runtime.getRuntime();
        
        // Microsoft Edge open karne ki koshish (Windows systems ke liye)
        Process process = runtime.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        
        System.out.println("Microsoft Edge khul gaya hai.");
        System.out.println("Runtime object: " + runtime);
        System.out.println("Process object: " + process);
    }
}
