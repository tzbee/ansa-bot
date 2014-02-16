grammar Commands;

commandId
:
	sysout
	| input
	| httprequest
	| getcontent
	| format
;
 
format
:
	FORMAT
;

FORMAT
:
	'format'
;

getcontent
:
	GET_CONTENT
;

GET_CONTENT
:
	'getcontent'
;

httprequest
:
	HTTP_REQUEST
;

HTTP_REQUEST
:
	'httprequest'
;

sysout
:
	SYSOUT
;

SYSOUT
:
	'sysout'
;

input
:
	INPUT
;

INPUT
:
	'setinput'
;







