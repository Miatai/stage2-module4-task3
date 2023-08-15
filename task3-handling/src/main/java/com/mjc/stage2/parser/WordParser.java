package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        for (Character ch : string.toCharArray()) {
            abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, ch));
        }
    }
}
