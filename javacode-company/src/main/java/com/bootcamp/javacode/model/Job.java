package com.bootcamp.javacode.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class Job {

  private LocalDate startDate;

  private LocalDate deadline;

  public static void main(String[] args) {
    Job job = Job.builder() //
        .startDate(LocalDate.of(2023, 1, 23)) //
        .deadline(LocalDate.of(2023, 12, 31)) //
        .build();
    
    Job job2 = Job.builder().build();
  }

}
