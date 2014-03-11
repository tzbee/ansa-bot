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
	QUOTED_STRING
;



PARAM_DELIMITER
:
	':'
;

