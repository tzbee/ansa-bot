lexer grammar Primitives;

QUOTED_STRING
:
	SINGLE_QUOTE STRING SINGLE_QUOTE
;

fragment
STRING
:
	~[\n\r]+?
;

SINGLE_QUOTE
:
	'\''
;

fragment
LETTER
:
	[a-zA-Z]
;

WS
:
	[ \r\n\t]+ -> skip
;

