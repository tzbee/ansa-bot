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
	PARAM_ID
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

