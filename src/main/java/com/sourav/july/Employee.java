package com.sourav.july;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// @Data - @code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode

@Builder
@Data
@AllArgsConstructor

public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;

}
