package com.packtp.tddjava.ch03ttt;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Johnson
 * @date 2020/2/26 17:46
 */
public class FooTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Foo foo;

    @Before
    public final void before() {
        foo = new Foo();
    }

    @Test
    public void whenDoFooThenThrowRuntimeException(){
        exception.expect(RuntimeException.class);
        foo.doFoo();
    }
}
