grammar Params;

import Primitives;

paramBlock
:
	'(' paramList ')'
;

paramList
:
	paramPair
	(
		',' paramPair
	)*
;

paramPair
:
	paramName PARAM_DELIMITER paramValue
;

paramName
:
	ID
;

paramValue
:
	paramString
	| paramRef
;

paramString
:
	QUOTED_STRING
;

paramRef
:
	ID
;

PARAM_DELIMITER
:
	':'
;

