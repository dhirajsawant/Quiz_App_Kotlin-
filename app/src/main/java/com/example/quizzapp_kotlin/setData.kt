package com.example.quizzapp_kotlin

object setData {

    const val name: String = "name"
    const val score: String = "score"

    fun getQuestion(): ArrayList<QuestionData> {
        var que: ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "Who is known as father of Java Programming Language?",

            "James Gosling",
            "M. P Java",
            "Charel Babbage ",
            "Blais Pascal",
            1
        )
        var question2 = QuestionData(
            2,
            "What is the size of int variable?",

            "8 bit",
            "16 bit",
            "32 bit",
            "64 bit",
            3
        )
        var question3 = QuestionData(
            3,
            "What of the following is the default value of an instance variable?",

            "Depends upon the type of variable",
            "null",
            "0",
            "not assigned",
            1
        )
        var question4 = QuestionData(
            4,
            "Which is a reserved word in the Java programming language?",

            "method",
            "native",
            "reference",
            "array",
            2
        )

        var question5 = QuestionData(
            5,
            "Which of the following is NOT a keywords or reserved words in Java?",

            "if",
            "then",
            "go to",
            "while",
            2
        )

        var question6 = QuestionData(
            6,
            "Which of the following are not Java modifiers?",

            "public",
            "private",
            "friendly",
            "transient",
            3
        )

        var question7 = QuestionData(
            7,
            "Which provides runtime environment for java byte code to be executed?",

            "JDK",
            "JVM",
            "JRE",
            "JAVAC",
            2
        )

        var question8 = QuestionData(
            8,
            "Inner classes are?",

            "anonymous classes",
            "nested classes",
            "subclasses",
            "derived classes",
            2
        )

        var question9 = QuestionData(
            9,
            "What is the full form of JVM ?",

            "Java Very Large Machine",
            "Java Verified Machine",
            "Java Very Small Machine",
            "Java Virtual Machine",
            4
        )

        var question10 = QuestionData(
            10,

            "Which of these is not a bitwise operator?",

            "&' Operator",
            "&=' Operator",
            "|=' Operator",
            "<=' Operator",
            4
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)


            return que
    }
}