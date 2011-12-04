(def *menu-bar* (new Menu *shell* SWT/BAR))
(def *file-menu-header* (new MenuItem *menu-bar* SWT/CASCADE))
(.setText *file-menu-header* "&File")
(def *file-menu* (new Menu *shell* SWT/DROP_DOWN))
(.setMenu *file-menu-header* *file-menu*)
(def *options-menu-header* (new MenuItem *menu-bar* SWT/CASCADE))
(.setText *options-menu-header* "&Options")
(def *options-menu* (new Menu *shell* SWT/DROP_DOWN))
(.setMenu *options-menu-header* *options-menu*)
(def *stats-menu-header* (new MenuItem *menu-bar* SWT/CASCADE))
(.setText *stats-menu-header* "&Stats")
(def *stats-menu* (new Menu *shell* SWT/DROP_DOWN))
(.setMenu *stats-menu-header* *stats-menu*)
(def *help-menu-header* (new MenuItem *menu-bar* SWT/CASCADE))
(.setText *help-menu-header* "&Help")
(def *help-menu* (new Menu *shell* SWT/DROP_DOWN))
(.setMenu *help-menu-header* *help-menu*)
