package com.craftinginterpreters.lox;

import org.junit.jupiter.api.Test;

import static com.craftinginterpreters.lox.TokenType.NUMBER;
import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {

    @Test
    void visitBinaryExpr() {

    }

    @Test
    void visitGroupingExpr() {
    }

    @Test
    void visitLiteralExpr() {
        Expr.Literal literal = new Expr.Literal(123);
        Interpreter interpreter = new Interpreter();
        Object o = interpreter.visitLiteralExpr(literal);
        assertInstanceOf(Integer.class, o);
        assertEquals(123, o);
    }

    @Test
    void visitUnaryExpr() {
    }
}