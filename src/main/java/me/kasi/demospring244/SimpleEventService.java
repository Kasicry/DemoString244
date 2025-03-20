package me.kasi.demospring244;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

    @PerLogging
    @Override
    public void createEvent() {
//        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Created an event");
//        System.out.println(System.currentTimeMillis() - begin);
    }

    @PerLogging
    @Override
    public void pulishEvent() {
//        long begin = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Published an event");
//        System.out.println(System.currentTimeMillis() - begin);
    }

    public void deleteEvent(){
        System.out.println("Delete an event");
    }
}
