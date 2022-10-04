package com.lec.spring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class BookReviewInfo extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    // 1:1 연결하기 BookReviewInfo : Book
	//	private Long bookId;
	@OneToOne(optional = false) // BookReviewInfo : Book 이 1:1로 매핑
								// Book은 절대 null을 허용하지 않는다
	private Book book; // 부모 Entity를 직접 참조
    // 기본적으로 Entity 에선 직접적으로 다른 Entity 를 직접 참조 못한다
    // @OneToOne 과 같은 relation 어노테이션을 지정해주어야 한다.
    // 이후 Entity 에서 해당 참조 객체에 대해 getter, settter 호출 하면
    // JPA 에선 Relation 을 '자동 처리' 해줍니다.

    // NULL 을 허용하면 wrapper 객체 사용
    // NULL 을 허용하지 않을거면 primitive 객체 사용
    // 이번예제에서 아래 두개값은 기본값 0 을 사용하기 위해 primitive 를 사용합니다.
    //   --> 굳이 null check 안해도 된다.
	private float averageReviewScore;
	private int reviewCount;
	
}
