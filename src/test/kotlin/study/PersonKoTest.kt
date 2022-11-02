package study

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe

class PersonKoTest : StringSpec({
    "이름 붙인 인자" {
        val person = Person(name = "강래민", age = 30, nickname = "래머")
        person.name shouldBe "강래민"
        person.age shouldBe 30
        person.nickname shouldBe "래머"
    }

    "널 타입" {
        val person = Person("강래민", 30, null)
        person.nickname.shouldBeNull()
    }

    "기본 인지" {
        val person = Person("강래민", 30)
        person.nickname shouldBe person.name
    }

    "데이터 클래스" {
        val person1 = Person("강래민", 30)
        val person2 = Person("강래민", 30)
        person1 shouldBe person2
    }
})
