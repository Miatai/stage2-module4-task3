package com.mjc.stage2.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser{
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        if(abstractTextComponent.getComponentType() == TextComponentType.SENTENCE){
            String[] lexemes = string.split(LEXEME_REGEX);
            Pattern wordPattern = Pattern.compile(WORD_REGEX);
            for (String lexeme : lexemes) {
                AbstractTextComponent textComponent;
                Matcher wordMatcher = wordPattern.matcher(lexeme);
                if(wordMatcher.find()){
                    textComponent = new TextComponent(TextComponentType.WORD);
                    nextParser.parse(textComponent, lexeme);
                } else {
                    textComponent = new SymbolLeaf(TextComponentType.SYMBOL, lexeme.charAt(0));
                }
                abstractTextComponent.add(textComponent);
            }
        }
    }
}
