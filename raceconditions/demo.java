package raceconditions;



class TextEditor extends Thread {

    @Override
    public void run() {
       

        String threadname = Thread.currentThread().getName();

        if(threadname.equals("TYPE")) {
            try {
                Type();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            else if(threadname.equals("SAVE")) {
                try {
                    autoSave();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(threadname.equals("SPELL")) {
                try {
                    spellCheck();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }



     void Type() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Typing...");
            Thread.sleep(1000);
        }
       }


       void autoSave() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("AutoSAVING...");
            Thread.sleep(1000);
        }
       }

       void spellCheck() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("SPELLchecking...");
            Thread.sleep(1000);
        }
       }
}




public class demo {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();

       Thread t1 = new Thread(te);
       Thread t2 = new Thread(te);
       Thread t3 = new Thread(te);

       t1.setName("TYPE");
       t2.setName("SAVE");
       t3.setName("SPELL");


       t1.start();
         t2.start();
         t3.start();


    }
}
