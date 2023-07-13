package com.simmondobber.ast.parser.package_;

import com.simmondobber.ast.components.complexAstComponents.package_.Package;
import com.simmondobber.ast.components.simpleAstComponents.Character;
import com.simmondobber.ast.components.simpleAstComponents.Keyword;
import com.simmondobber.ast.components.simpleAstComponents.Path;
import com.simmondobber.ast.parser.AstParser;
import com.simmondobber.ast.parser.Pointer;

public class PackageParser extends AstParser {

    public PackageParser(Pointer pointer) {
        super(pointer);
    }

    @Override
    public Package parse() {
        Keyword keyword = new Keyword(this.pointer.getWord(), this.pointer.getSeparator());
        Path path = new Path(this.pointer.getCompoundWord(), this.pointer.getSeparator());
        Character semicolon = new Character(this.pointer.getCharacter(), this.pointer.getSeparator());
        return new Package(keyword, path, semicolon);
    }
}
