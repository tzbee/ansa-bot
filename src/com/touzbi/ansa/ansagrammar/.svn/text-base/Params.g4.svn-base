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
	paramName PARAM_DELIMITER paramValues
;

paramName
:
	PARAM_ID
;

paramValues
:
	paramValue
	| '[' paramValue
	(
		',' paramValue
	)* ']'
;

paramValue
:
	QUOTED_STRING
;

PARAM_ID
:
	LETTER+
;

PARAM_DELIMITER
:
	':'
;

