package com.simmondobber.ast.components.simpleAstComponents;

import com.simmondobber.ast.components.SimpleAstComponent;
import com.simmondobber.ast.components.complexAstComponents.field.preamble.FieldPreambleComponent;

import java.util.List;

public class FieldKeyword extends SimpleAstComponent implements FieldPreambleComponent {

    public final static List<String> KEYWORDS = List.of("final", "private", "protected", "public", "static", "transient", "volatile");

    public FieldKeyword(String syntax, String separator) {
        super(syntax, separator);
    }
}