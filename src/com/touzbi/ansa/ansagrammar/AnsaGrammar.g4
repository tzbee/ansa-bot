grammar AnsaGrammar;

import Comments, Commands, Params;

init
:
	(
		commandBlock ';'
	)*
;

commandBlock
:
	commandId paramBlock*
; 




