package callback;

public final class App {

    private App() {
    }


    public static void main(final String[] args) {
        int i = 100;

        SimpleBackTask simpleBackTask = new SimpleBackTask();
        simpleBackTask.execute(() -> {
            System.out.println("hehe:" + i);
        });
    }
}
