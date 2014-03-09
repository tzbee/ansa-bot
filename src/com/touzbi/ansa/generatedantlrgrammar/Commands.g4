grammar Commands;

commandId
:
	sysout
	| gethtmlattribute
	| gethtmltext
	| getcontentbyregex
	| httprequest
	| download
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

getcontentbyregex
:
	GET_CONTENT_BY_REGEX
;

GET_CONTENT_BY_REGEX
:
	'getcontentbyregex'
;

gethtmltext
:
	GET_HTML_TEXT
;

GET_HTML_TEXT
:
	'gethtmltext'
;

download
:
	DOWNLOAD
;

DOWNLOAD
:
	'download'
;

httprequest
:
	HTTP_REQUEST
;

HTTP_REQUEST
:
	'httprequest'
;

gethtmlattribute
:
	GET_HTML_ATTRIBUTE
;

GET_HTML_ATTRIBUTE
:
	'gethtmlattribute'
;

sysout
:
	SYSOUT
;

SYSOUT
:
	'print'
;



 





