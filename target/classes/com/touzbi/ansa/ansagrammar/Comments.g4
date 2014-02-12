lexer grammar Comments;

LINE_COMMENT
:
	'##' ~[\r\n]* -> skip
;