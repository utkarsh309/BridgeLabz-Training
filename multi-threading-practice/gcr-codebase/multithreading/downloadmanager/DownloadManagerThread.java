package multithreading.downloadmanager;

class FileDownloader extends Thread {

    private String fileName;

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + Thread.currentThread().getName()
                    + "] Downloading " + fileName + ": " + progress + "%");

            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

public class DownloadManagerThread {

    public static void main(String[] args) throws InterruptedException {

        FileDownloader t1 = new FileDownloader("Document.pdf");
        FileDownloader t2 = new FileDownloader("Image.jpg");
        FileDownloader t3 = new FileDownloader("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
