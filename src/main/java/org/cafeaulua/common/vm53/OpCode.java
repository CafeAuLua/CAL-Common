package org.cafeaulua.common.vm53;

/**
 * Instruction references as enum
 */
public enum OpCode {
    MOVE        (0b000000),
    LOADK       (0b000001),
    LOADKX      (0b000010),
    LOADBOOL    (0b000011),
    LOADNIL     (0b000100),
    GETUPVAL    (0b000101),
    GETTABUP    (0b000110),
    GETTABLE    (0b000111),
    SETTABUP    (0b001000),
    SETUPVAL    (0b001001),
    SETTABLE    (0b001010),
    NEWTABLE    (0b001011),
    SELF        (0b001100),
    ADD         (0b001101),
    SUB         (0b001110),
    MUL         (0b001111),
    MOD         (0b010000),
    POW         (0b010001),
    DIV         (0b010010),
    IDIV        (0b010011),
    BAND        (0b010100),
    BOR         (0b010101),
    BXOR        (0b010110),
    SHL         (0b010111),
    SHR         (0b011000),
    UNM         (0b011001),
    BNOT        (0b011010),
    NOT         (0b011011),
    LEN         (0b011100),
    CONCAT      (0b011101),
    JMP         (0b011110),
    EQ          (0b011111),
    LT          (0b100000),
    LE          (0b100001),
    TEST        (0b100010),
    TESTSET     (0b100011),
    CALL        (0b100100),
    TAILCALL    (0b100101),
    RETURN      (0b100110),
    FORLOOP     (0b100111),
    FORPREP     (0b101000),
    TFORCALL    (0b101001),
    TFORLOOP    (0b101010),
    SETLIST     (0b101011),
    CLOSURE     (0b101100),
    VARARG      (0b101101),
    EXTRAARG    (0b101110);

    public final int oc;  // opcode as LE byte
    OpCode(int b) { oc = b; }
}
