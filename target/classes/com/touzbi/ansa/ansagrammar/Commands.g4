grammar Commands;

commandId
:
	sysout
	| gethtmlattribute
	| httprequest
	| download
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
	'sysout'
;



 





