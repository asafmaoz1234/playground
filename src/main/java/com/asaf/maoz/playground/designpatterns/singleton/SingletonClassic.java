package com.asaf.maoz.playground.designpatterns.singleton;

import static java.util.Objects.nonNull;

public class SingletonClassic {
    private static SingletonClassic singletonClassic;

    private SingletonClassic() {
    }

    public static SingletonClassic getInstance() {
        if(nonNull(singletonClassic)) {
            return singletonClassic;
        }
        singletonClassic = createInstance();
        return singletonClassic;
    }


    private static synchronized SingletonClassic createInstance() {
        if(nonNull(singletonClassic)) {
            return singletonClassic;
        }
        singletonClassic = new SingletonClassic();
        return singletonClassic;
    }
}
