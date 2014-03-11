grammar AnsaGrammar;

import Comments, Params, Primitives;

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

commandId
:
	ID
;

