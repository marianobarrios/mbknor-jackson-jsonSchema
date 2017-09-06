package com.simscale.specs.schemagen.testDataScala

import java.time.{LocalDate, LocalDateTime, OffsetDateTime}

case class ManyDates
(
  javaLocalDateTime:LocalDateTime,
  javaOffsetDateTime:OffsetDateTime,
  javaLocalDate:LocalDate
)
