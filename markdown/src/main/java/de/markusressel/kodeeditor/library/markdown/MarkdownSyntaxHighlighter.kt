package de.markusressel.kodeeditor.library.markdown

import de.markusressel.kodeeditor.library.markdown.colorscheme.DarkBackgroundColorScheme
import de.markusressel.kodeeditor.library.markdown.rule.*
import de.markusressel.kodeeditor.library.syntaxhighlighter.SyntaxColorScheme
import de.markusressel.kodeeditor.library.syntaxhighlighter.SyntaxHighlighterBase
import de.markusressel.kodeeditor.library.syntaxhighlighter.SyntaxHighlighterRule

class MarkdownSyntaxHighlighter : SyntaxHighlighterBase() {

    override fun getRules(): Set<SyntaxHighlighterRule> {
        return setOf(HeadingRule(), ItalicRule(), BoldRule(), CodeInlineRule(), CodeLineRule(), TextLinkRule(), ImageLinkRule(), StrikeRule())
    }

    override fun getDefaultColorScheme(): SyntaxColorScheme {
        return DarkBackgroundColorScheme()
    }

}