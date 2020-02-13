public class Application {
    public static void main(String[] args) {
        WindowsF5 intellijIdea = new IntellijIdeaF5();
        WindowsF5 chrome = new ChromeF5();
        intellijIdea.pressF5();
        chrome.pressF5();
    }
}
