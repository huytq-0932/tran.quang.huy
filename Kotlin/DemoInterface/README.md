# Implements 2 interface có phương thức default cùng chữ kí
Trong java, khi một class implements 2 interface có cùng chữ kí, class đó bắt buộc phải override lại phương thức đó 

```Java
public interface A {
    void println(); 
    default void print() {
        System.out.println("A");
    }
}

public interface B {
    void println();
    default void print() {
        System.out.println("B");
    }
}

public class C implements A, B {

    @Override
    public void println() {
        
    }

    @Override
    public void print() {
        // Bắt buộc phải override nếu không sẽ báo lỗi
    }
}
```