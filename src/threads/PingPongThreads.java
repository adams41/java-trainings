package threads;

import java.util.concurrent.atomic.AtomicBoolean;

public class PingPongThreads {

    public static void main(String[] args) {

            AtomicBoolean isPingPongTurn = new AtomicBoolean(true);
            Object lock = new Object();

                Runnable pingRunnable = () -> {
                    synchronized (lock) {
                        for (int i = 0; i < 10; i++) {
                            while (!isPingPongTurn.get()) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            System.out.println("Ping");
                            isPingPongTurn.set(false);
                            lock.notifyAll();

                        }
                }

            };


            Runnable pongRunnable = () -> {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (isPingPongTurn.get()) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.println("Pong");
                        isPingPongTurn.set(true);
                        lock.notifyAll();

                    }
                }

            };


            Thread ping = new Thread(pingRunnable);
            Thread pong = new Thread(pongRunnable);

            ping.start();
            pong.start();

        }

    }
