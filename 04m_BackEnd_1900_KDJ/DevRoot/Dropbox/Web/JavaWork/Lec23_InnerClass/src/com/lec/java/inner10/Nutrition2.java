package com.lec.java.inner10;

/*
 * 자바빈 패턴(JavaBeans pattern)
 * 	setter메서드를 이용해 생성 코드를 읽기 좋게 만드는 것
 * 
 * 장점
 * 	이제 각 인자의 의미를 파악하기 쉬워졌다.
 * 	복잡하게 여러 개의 생성자를 만들지 않아도 된다.
 * 
 * 단점
 * 	객체 일관성(consistency)이 깨진다.
 * 	1회의 호출로 객체 생성이 끝나지 않았다.
 * 	즉 한 번에 생성하지 않고 생성한 객체에 값을 떡칠하고 있다.
 * 	setter 메서드가 있으므로 변경 불가능(immutable)클래스를 만들 수가 없다. (즉 final 멤버변수에선 사용 불가)
 * 	스레드 안전성을 확보하려면 점층적 생성자 패턴보다 많은 일을 해야 한다.
 */
public class Nutrition2 {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbonhydrate;
    
    // TODO
    
    
} // end class
















