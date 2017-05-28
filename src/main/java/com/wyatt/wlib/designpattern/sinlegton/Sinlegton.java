package com.wyatt.wlib.designpattern.sinlegton;

import java.io.ObjectStreamException;

/**
 * Created by wyatt on 2017/4/17.
 *
 * 小心反射(Reflection)和序列化(Serialization)
 * 反射(Reflection)API会调用私有的构造器，所以为了防止创建超过一个实例，可以通过从构造器抛出异常来解决。
 * 类似的，序列化和反序列化可能会创建两个不同的实例，可以通过重写序列化API中的readResolve()方法来解决。
 */
public class Sinlegton {

    private static final Sinlegton INSTANCE = new Sinlegton();

    private Sinlegton() { }

    public static Sinlegton getInstance() { return INSTANCE; }

    private Object readResolve() throws ObjectStreamException {
        // instead of the object we're on,
        // return the class variable INSTANCE
        return INSTANCE;
    }
}
