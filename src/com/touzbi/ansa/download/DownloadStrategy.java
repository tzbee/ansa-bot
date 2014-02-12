package com.touzbi.ansa.download;

import java.util.Collection;

public interface DownloadStrategy {
	void download(String... urls);

	void download(Collection<String> urls);
}
