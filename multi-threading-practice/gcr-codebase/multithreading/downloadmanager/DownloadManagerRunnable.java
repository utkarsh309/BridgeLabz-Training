package multithreading.downloadmanager;


class FileDownloaderRunnable implements Runnable {

    private String fileName;

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + Thread.currentThread().getName()
                    + "] Downloading " + fileName + ": " + progress + "%");

            try {
                Thread.sleep((int) (Math.random() * 1000)); // random delay
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}

public class DownloadManagerRunnable {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 =new Thread(new FileDownloaderRunnable("Document.pdf"));
        Thread t2 =new Thread(new FileDownloaderRunnable("Image.jpg"));
        Thread t3 =new Thread(new FileDownloaderRunnable("Video.mp4"));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}

