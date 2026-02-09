package com.multithreading;

class FileTask implements Runnable {

    private String fileName;
    private int delay;

    public FileTask(String fileName, int delay) {
        this.fileName = fileName;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + " " + i + "%");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(fileName + " interrupted.");
            }
        }
    }
}

public class FileDownloader {
    public static void main(String[] args) {

        Thread t1 = new Thread(new FileTask("Document.pdf", 500), "Downloader-Doc");
        Thread t2 = new Thread(new FileTask("Image.jpg", 1000), "Downloader-Img");
        Thread t3 = new Thread(new FileTask("Video.mp4", 1500), "Downloader-Video");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All downloads complete!");
    }
}
