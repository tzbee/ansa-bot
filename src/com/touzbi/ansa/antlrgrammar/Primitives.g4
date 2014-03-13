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
	[a-zA-Z-]
;

fragment
NUMBER
:
	[0-9]+
;

WS
:
	[ \r\n\t]+ -> skip
;

ID
:
	(
		LETTER
		| NUMBER
	)+
; 
