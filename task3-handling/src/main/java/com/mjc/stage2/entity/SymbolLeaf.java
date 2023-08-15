package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {
    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }
}